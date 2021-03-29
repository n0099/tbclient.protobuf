package tbclient.Lottery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ActRegular extends Message {
    public static final String DEFAULT_BTN_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String btn_name;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer chance;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_CHANCE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ActRegular> {
        public String btn_name;
        public Integer chance;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(ActRegular actRegular) {
            super(actRegular);
            if (actRegular == null) {
                return;
            }
            this.type = actRegular.type;
            this.chance = actRegular.chance;
            this.url = actRegular.url;
            this.btn_name = actRegular.btn_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ActRegular build(boolean z) {
            return new ActRegular(this, z);
        }
    }

    public ActRegular(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.chance;
            if (num2 == null) {
                this.chance = DEFAULT_CHANCE;
            } else {
                this.chance = num2;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.btn_name;
            if (str2 == null) {
                this.btn_name = "";
                return;
            } else {
                this.btn_name = str2;
                return;
            }
        }
        this.type = builder.type;
        this.chance = builder.chance;
        this.url = builder.url;
        this.btn_name = builder.btn_name;
    }
}
