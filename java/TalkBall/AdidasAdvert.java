package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class AdidasAdvert extends Message {
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_IMG_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img_url;

    private AdidasAdvert(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img_url == null) {
                this.img_url = "";
            } else {
                this.img_url = builder.img_url;
            }
            if (builder.ahead_url == null) {
                this.ahead_url = "";
                return;
            } else {
                this.ahead_url = builder.ahead_url;
                return;
            }
        }
        this.img_url = builder.img_url;
        this.ahead_url = builder.ahead_url;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<AdidasAdvert> {
        public String ahead_url;
        public String img_url;

        public Builder() {
        }

        public Builder(AdidasAdvert adidasAdvert) {
            super(adidasAdvert);
            if (adidasAdvert != null) {
                this.img_url = adidasAdvert.img_url;
                this.ahead_url = adidasAdvert.ahead_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdidasAdvert build(boolean z) {
            return new AdidasAdvert(this, z);
        }
    }
}
