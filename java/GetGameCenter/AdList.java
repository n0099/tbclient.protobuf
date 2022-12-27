package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AdList extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String link_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AdList> {
        public String img_url;
        public String link_url;

        public Builder() {
        }

        public Builder(AdList adList) {
            super(adList);
            if (adList == null) {
                return;
            }
            this.link_url = adList.link_url;
            this.img_url = adList.img_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdList build(boolean z) {
            return new AdList(this, z);
        }
    }

    public AdList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.link_url;
            if (str == null) {
                this.link_url = "";
            } else {
                this.link_url = str;
            }
            String str2 = builder.img_url;
            if (str2 == null) {
                this.img_url = "";
                return;
            } else {
                this.img_url = str2;
                return;
            }
        }
        this.link_url = builder.link_url;
        this.img_url = builder.img_url;
    }
}
