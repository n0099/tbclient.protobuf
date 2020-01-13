package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class EsportStatic extends Message {
    public static final String DEFAULT_IMG = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String img;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private EsportStatic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.img == null) {
                this.img = "";
            } else {
                this.img = builder.img;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.img = builder.img;
        this.url = builder.url;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<EsportStatic> {
        public String img;
        public String url;

        public Builder() {
        }

        public Builder(EsportStatic esportStatic) {
            super(esportStatic);
            if (esportStatic != null) {
                this.img = esportStatic.img;
                this.url = esportStatic.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EsportStatic build(boolean z) {
            return new EsportStatic(this, z);
        }
    }
}
