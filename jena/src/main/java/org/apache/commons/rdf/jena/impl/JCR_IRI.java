/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.rdf.jena.impl;

import org.apache.jena.graph.Node ;
import org.apache.jena.graph.NodeFactory ;

import org.apache.commons.rdf.api.* ;
import org.apache.commons.rdf.jena.JenaNode;

public class JCR_IRI extends JCR_Term implements IRI, JenaNode {

    /*package*/ JCR_IRI(String iriStr) {
        super(NodeFactory.createURI(iriStr)) ;
    }
    
    /*package*/ JCR_IRI(Node node) {
        super(node) ;
    }

    @Override
    public String getIRIString() {
        return getNode().getURI() ;
    }
    
    @Override
    public int hashCode() {
        return getIRIString().hashCode() ;
    }
    
    @Override
    public boolean equals(Object other) {
        if ( other == this ) return true ;
        if ( other == null ) return false ;
        if ( ! ( other instanceof IRI ) ) return false ;
        IRI iri = (IRI)other ;
        return getIRIString().equals(iri.getIRIString()) ;
    }
}
