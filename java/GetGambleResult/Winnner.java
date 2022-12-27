package tbclient.GetGambleResult;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Winnner extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_SCORE = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer score;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Winnner> {
        public String portrait;
        public Integer score;
        public Integer time;
        public Integer type;
        public String user_name;

        public Builder() {
        }

        public Builder(Winnner winnner) {
            super(winnner);
            if (winnner == null) {
                return;
            }
            this.user_name = winnner.user_name;
            this.portrait = winnner.portrait;
            this.score = winnner.score;
            this.time = winnner.time;
            this.type = winnner.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Winnner build(boolean z) {
            return new Winnner(this, z);
        }
    }

    public Winnner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.score;
            if (num == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = num;
            }
            Integer num2 = builder.time;
            if (num2 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num2;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num3;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.score = builder.score;
        this.time = builder.time;
        this.type = builder.type;
    }
}
