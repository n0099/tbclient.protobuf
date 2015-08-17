package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AdList extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_LINK_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String link_url;

    /* synthetic */ AdList(Builder builder, boolean z, AdList adList) {
        this(builder, z);
    }

    private AdList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.link_url == null) {
                this.link_url = "";
            } else {
                this.link_url = builder.link_url;
            }
            if (builder.img_url == null) {
                this.img_url = "";
                return;
            } else {
                this.img_url = builder.img_url;
                return;
            }
        }
        this.link_url = builder.link_url;
        this.img_url = builder.img_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AdList> {
        public String img_url;
        public String link_url;

        public Builder() {
        }

        public Builder(AdList adList) {
            super(adList);
            if (adList != null) {
                this.link_url = adList.link_url;
                this.img_url = adList.img_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdList build(boolean z) {
            return new AdList(this, z, null);
        }
    }
}
