package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class EsportInfo extends Message {
    public static final String DEFAULT_INTRO = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String intro;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<EsportInfo> {
        public String intro;

        public Builder() {
        }

        public Builder(EsportInfo esportInfo) {
            super(esportInfo);
            if (esportInfo == null) {
                return;
            }
            this.intro = esportInfo.intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EsportInfo build(boolean z) {
            return new EsportInfo(this, z);
        }
    }

    public EsportInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.intro;
            if (str == null) {
                this.intro = "";
                return;
            } else {
                this.intro = str;
                return;
            }
        }
        this.intro = builder.intro;
    }
}
