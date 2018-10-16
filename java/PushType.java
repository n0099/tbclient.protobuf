package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class PushType extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    private PushType(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.icon == null) {
                this.icon = "";
                return;
            } else {
                this.icon = builder.icon;
                return;
            }
        }
        this.type = builder.type;
        this.name = builder.name;
        this.icon = builder.icon;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<PushType> {
        public String icon;
        public String name;
        public Integer type;

        public Builder() {
        }

        public Builder(PushType pushType) {
            super(pushType);
            if (pushType != null) {
                this.type = pushType.type;
                this.name = pushType.name;
                this.icon = pushType.icon;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PushType build(boolean z) {
            return new PushType(this, z);
        }
    }
}
