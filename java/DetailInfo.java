package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DetailInfo extends Message {
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private DetailInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.text == null) {
                this.text = "";
            } else {
                this.text = builder.text;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.text = builder.text;
        this.url = builder.url;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DetailInfo> {
        public String text;
        public String url;

        public Builder() {
        }

        public Builder(DetailInfo detailInfo) {
            super(detailInfo);
            if (detailInfo != null) {
                this.text = detailInfo.text;
                this.url = detailInfo.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DetailInfo build(boolean z) {
            return new DetailInfo(this, z);
        }
    }
}
