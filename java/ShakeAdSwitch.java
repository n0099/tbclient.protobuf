package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ShakeAdSwitch extends Message {
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_IS_SHOW = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_show;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ShakeAdSwitch> {
        public String desc;
        public Integer is_show;
        public String title;

        public Builder() {
        }

        public Builder(ShakeAdSwitch shakeAdSwitch) {
            super(shakeAdSwitch);
            if (shakeAdSwitch == null) {
                return;
            }
            this.is_show = shakeAdSwitch.is_show;
            this.title = shakeAdSwitch.title;
            this.desc = shakeAdSwitch.desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ShakeAdSwitch build(boolean z) {
            return new ShakeAdSwitch(this, z);
        }
    }

    public ShakeAdSwitch(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_show;
            if (num == null) {
                this.is_show = DEFAULT_IS_SHOW;
            } else {
                this.is_show = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
                return;
            } else {
                this.desc = str2;
                return;
            }
        }
        this.is_show = builder.is_show;
        this.title = builder.title;
        this.desc = builder.desc;
    }
}
