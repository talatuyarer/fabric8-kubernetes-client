/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.examples.kubectl.equivalents;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;

/**
 * This sample code is Java equivalent to `kubectl delete pod my-pod`. It assumes that
 * a Pod with specified name exists in the cluster.
 */
public class PodDelete {
    public static void main(String[] args) {
        try (final KubernetesClient k8s = new KubernetesClientBuilder().build()) {
            k8s.pods().inNamespace("default").withName("my-pod").delete();
        }
    }
}
