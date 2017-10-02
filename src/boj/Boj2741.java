/*
 * Copyright 2017 jinsil park
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 * .
 */

package boj;

/**
 * Created by jinsil on 2017-10-02
 * Site       : https://www.acmicpc.net/problem/10172
 */


import java.io.*;
import java.util.*;

public class Boj2741 {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int i;
        i = scanner.nextInt();

        int n;
        n=++i;

        for(i=1; i<n; i++) {
            System.out.println(i);
        }

    }
}

