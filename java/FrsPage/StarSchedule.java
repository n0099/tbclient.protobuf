package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
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

    private StarSchedule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = builder.time;
            }
            if (builder.type == null) {
                this.type = "";
            } else {
                this.type = builder.type;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.time = builder.time;
        this.type = builder.type;
        this.desc = builder.desc;
        this.url = builder.url;
    }

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
            if (starSchedule != null) {
                this.time = starSchedule.time;
                this.type = starSchedule.type;
                this.desc = starSchedule.desc;
                this.url = starSchedule.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StarSchedule build(boolean z) {
            return new StarSchedule(this, z);
        }
    }
}
