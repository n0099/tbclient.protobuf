package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class StarSchedule extends Message {
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_TIME = 0;
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<StarSchedule> {
        public String desc;
        public Integer time;
        public String type;
        public String url;

        public Builder() {
        }

        public Builder(StarSchedule starSchedule) {
            super(starSchedule);
            if (starSchedule == null) {
                return;
            }
            this.time = starSchedule.time;
            this.type = starSchedule.type;
            this.desc = starSchedule.desc;
            this.url = starSchedule.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarSchedule build(boolean z) {
            return new StarSchedule(this, z);
        }
    }

    public StarSchedule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.url;
            if (str3 == null) {
                this.url = "";
                return;
            } else {
                this.url = str3;
                return;
            }
        }
        this.time = builder.time;
        this.type = builder.type;
        this.desc = builder.desc;
        this.url = builder.url;
    }
}
