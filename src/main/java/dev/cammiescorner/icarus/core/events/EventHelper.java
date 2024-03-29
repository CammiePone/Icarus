/**
 * MIT License
 * <p>
 * Copyright (c) 2020 Mirsario
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.cammiescorner.icarus.core.events;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class EventHelper {
	private static final List<Event<?>> Events = new ArrayList<>();

	private EventHelper() {
	}

	public static void Update() {
		Events.forEach(Event::Update);
	}

	public static <T> Event<T> createEvent(Class<? super T> type, Function<T[], T> invokerFactory) {
		return createEvent(type, null, invokerFactory);
	}

	public static <T> Event<T> createEvent(Class<? super T> type, T emptyInvoker, Function<T[], T> invokerFactory) {
		Event<T> event = new Event<>(type, emptyInvoker, invokerFactory);

		Events.add(event);

		return event;
	}
}
