package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Superscript extends Message {
    public static final String DEFAULT_COLOR = "";
    public static final String DEFAULT_DESC = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String color;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String desc;

    private Superscript(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.color == null) {
                this.color = "";
                return;
            } else {
                this.color = builder.color;
                return;
            }
        }
        this.desc = builder.desc;
        this.color = builder.color;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Superscript> {
        public String color;
        public String desc;

        public Builder() {
        }

        public Builder(Superscript superscript) {
            super(superscript);
            if (superscript != null) {
                this.desc = superscript.desc;
                this.color = superscript.color;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Superscript build(boolean z) {
            return new Superscript(this, z);
        }
    }
}
