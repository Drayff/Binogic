/*
 * Copyright 2023 Andrew Motrych, and the Binogic contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.drayff.binogic;

import javax.swing.*;
import java.awt.*;

public class DrawMatrix {
    public static void consoleDraw(BinMatrix objectMatrix, String symbol){
        StringBuilder consoleMatrix = new StringBuilder();
        int[][] matrix = objectMatrix.getMatrix();

        for (int i = 0; i < matrix.length; i++) {
            consoleMatrix.append("\n");
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[i][j] == 0)
                    consoleMatrix.append("  ");
                else
                    consoleMatrix.append(symbol).append(" ");
            }
        }
        System.out.println(consoleMatrix);
    }

    public static void guiDraw(BinMatrix objectMatrix, String name, int height, int width){
        int[][] matrix = objectMatrix.getMatrix();

        JFrame frame = new JFrame(name);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);

        JPanel panel = new JPanel(new GridLayout(matrix.length, matrix.length));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(50, 50));

                if (matrix[i][j] == 0) {
                    cell.setBackground(Color.WHITE);
                } else if (matrix[i][j] == 1) {
                    cell.setBackground(Color.BLACK);
                }

                panel.add(cell);
            }
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}