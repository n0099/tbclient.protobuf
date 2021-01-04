package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class EsportInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String intro;

    private EsportInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.intro == null) {
                this.intro = "";
                return;
            } else {
                this.intro = builder.intro;
                return;
            }
        }
        this.intro = builder.intro;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<EsportInfo> {
        public String intro;

        public Builder() {
        }

        public Builder(EsportInfo esportInfo) {
            super(esportInfo);
            if (esportInfo != null) {
                this.intro = esportInfo.intro;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EsportInfo build(boolean z) {
            return new EsportInfo(this, z);
        }
    }
}
