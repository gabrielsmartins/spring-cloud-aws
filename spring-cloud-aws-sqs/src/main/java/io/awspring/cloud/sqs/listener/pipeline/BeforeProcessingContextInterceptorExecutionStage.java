/*
 * Copyright 2013-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.awspring.cloud.sqs.listener.pipeline;

import io.awspring.cloud.sqs.listener.MessageProcessingContext;
import io.awspring.cloud.sqs.listener.interceptor.AsyncMessageInterceptor;
import java.util.Collection;

/**
 * Stage responsible for executing the {@link AsyncMessageInterceptor}s from the {@link MessageProcessingContext} before
 * message processing.
 *
 * @author Tomaz Fernandes
 * @since 3.0
 */
public class BeforeProcessingContextInterceptorExecutionStage<T>
		extends AbstractBeforeProcessingInterceptorExecutionStage<T> {

	public BeforeProcessingContextInterceptorExecutionStage(MessageProcessingConfiguration<T> configuration) {
	}

	@Override
	protected Collection<AsyncMessageInterceptor<T>> getInterceptors(MessageProcessingContext<T> context) {
		return context.getInterceptors();
	}
}
