package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;

@HippoEssentialsGenerated(internalName = "myproject:oops")
@Node(jcrType = "myproject:oops")
public class Oops extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "myproject:i")
    public String getI() {
        return getSingleProperty("myproject:i");
    }

    @HippoEssentialsGenerated(internalName = "myproject:did")
    public String getDid() {
        return getSingleProperty("myproject:did");
    }

    @HippoEssentialsGenerated(internalName = "myproject:it")
    public String getIt() {
        return getSingleProperty("myproject:it");
    }

    @HippoEssentialsGenerated(internalName = "myproject:again")
    public String getAgain() {
        return getSingleProperty("myproject:again");
    }
}
