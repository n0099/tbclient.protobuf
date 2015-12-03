package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class HomePageResIdl extends Message {
    @ProtoField(tag = 1)
    public final DataRes data;
    @ProtoField(tag = 2)
    public final Error error;

    /* synthetic */ HomePageResIdl(Builder builder, boolean z, HomePageResIdl homePageResIdl) {
        this(builder, z);
    }

    private HomePageResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
            return;
        }
        this.data = builder.data;
        this.error = builder.error;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HomePageResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HomePageResIdl homePageResIdl) {
            super(homePageResIdl);
            if (homePageResIdl != null) {
                this.data = homePageResIdl.data;
                this.error = homePageResIdl.error;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HomePageResIdl build(boolean z) {
            return new HomePageResIdl(this, z, null);
        }
    }
}
