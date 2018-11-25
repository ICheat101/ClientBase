/*
 * Copyright (c) 2018 superblaubeere27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package net.superblaubeere27.clientbase.scripting.runtime.minecraft.util;

import net.minecraft.util.Timer;

public class WrapperTimer {
    private Timer real;

    public WrapperTimer(Timer var1) {
        this.real = var1;
    }

    public Timer unwrap() {
        return this.real;
    }

    public void updateTimer() {
        this.real.updateTimer();
    }

    public int getElapsedTicks() {
        return this.real.elapsedTicks;
    }

    public void setElapsedTicks(int var1) {
        this.real.elapsedTicks = var1;
    }

    public float getRenderPartialTicks() {
        return this.real.renderPartialTicks;
    }

    public void setRenderPartialTicks(float var1) {
        this.real.renderPartialTicks = var1;
    }

    public float getTimerSpeed() {
        return this.real.timerSpeed;
    }

    public void setTimerSpeed(float var1) {
        this.real.timerSpeed = var1;
    }

    public float getElapsedPartialTicks() {
        return this.real.elapsedPartialTicks;
    }

    public void setElapsedPartialTicks(float var1) {
        this.real.elapsedPartialTicks = var1;
    }
}
