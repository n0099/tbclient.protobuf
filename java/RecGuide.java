package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class RecGuide extends Message {
    public static final String DEFAULT_DOCUMENT = "";
    public static final String DEFAULT_PIC = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String document;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private RecGuide(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.document == null) {
                this.document = "";
            } else {
                this.document = builder.document;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.pic == null) {
                this.pic = "";
                return;
            } else {
                this.pic = builder.pic;
                return;
            }
        }
        this.document = builder.document;
        this.url = builder.url;
        this.pic = builder.pic;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<RecGuide> {
        public String document;
        public String pic;
        public String url;

        public Builder() {
        }

        public Builder(RecGuide recGuide) {
            super(recGuide);
            if (recGuide != null) {
                this.document = recGuide.document;
                this.url = recGuide.url;
                this.pic = recGuide.pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecGuide build(boolean z) {
            return new RecGuide(this, z);
        }
    }
}
