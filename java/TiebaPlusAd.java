package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class TiebaPlusAd extends Message {
    public static final String DEFAULT_AD_SOURCE = "";
    public static final String DEFAULT_COST_URL = "";
    public static final String DEFAULT_SHOW_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_source;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String cost_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String show_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TiebaPlusAd> {
        public String ad_source;
        public String cost_url;
        public String show_url;

        public Builder() {
        }

        public Builder(TiebaPlusAd tiebaPlusAd) {
            super(tiebaPlusAd);
            if (tiebaPlusAd == null) {
                return;
            }
            this.cost_url = tiebaPlusAd.cost_url;
            this.show_url = tiebaPlusAd.show_url;
            this.ad_source = tiebaPlusAd.ad_source;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TiebaPlusAd build(boolean z) {
            return new TiebaPlusAd(this, z);
        }
    }

    public TiebaPlusAd(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.cost_url;
            if (str == null) {
                this.cost_url = "";
            } else {
                this.cost_url = str;
            }
            String str2 = builder.show_url;
            if (str2 == null) {
                this.show_url = "";
            } else {
                this.show_url = str2;
            }
            String str3 = builder.ad_source;
            if (str3 == null) {
                this.ad_source = "";
                return;
            } else {
                this.ad_source = str3;
                return;
            }
        }
        this.cost_url = builder.cost_url;
        this.show_url = builder.show_url;
        this.ad_source = builder.ad_source;
    }
}
