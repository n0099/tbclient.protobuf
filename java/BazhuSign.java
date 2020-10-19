package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class BazhuSign extends Message {
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_LEVEL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String level;

    private BazhuSign(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.level == null) {
                this.level = "";
                return;
            } else {
                this.level = builder.level;
                return;
            }
        }
        this.desc = builder.desc;
        this.level = builder.level;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<BazhuSign> {
        public String desc;
        public String level;

        public Builder() {
        }

        public Builder(BazhuSign bazhuSign) {
            super(bazhuSign);
            if (bazhuSign != null) {
                this.desc = bazhuSign.desc;
                this.level = bazhuSign.level;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BazhuSign build(boolean z) {
            return new BazhuSign(this, z);
        }
    }
}
