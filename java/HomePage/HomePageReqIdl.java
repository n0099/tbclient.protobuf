package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class HomePageReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ HomePageReqIdl(Builder builder, boolean z, HomePageReqIdl homePageReqIdl) {
        this(builder, z);
    }

    private HomePageReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HomePageReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(HomePageReqIdl homePageReqIdl) {
            super(homePageReqIdl);
            if (homePageReqIdl != null) {
                this.data = homePageReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HomePageReqIdl build(boolean z) {
            return new HomePageReqIdl(this, z, null);
        }
    }
}
