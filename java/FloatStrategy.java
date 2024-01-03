package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FloatStrategy extends Message {
    public static final String DEFAULT_BROWSETIMEPAGE = "";
    public static final String DEFAULT_TOAST = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String browsetimepage;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer duration;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer show_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long show_time_begin;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long show_time_end;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String toast;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer un_do_mission;
    public static final Integer DEFAULT_UN_DO_MISSION = 0;
    public static final Integer DEFAULT_DURATION = 0;
    public static final Long DEFAULT_SHOW_TIME_BEGIN = 0L;
    public static final Long DEFAULT_SHOW_TIME_END = 0L;
    public static final Integer DEFAULT_SHOW_NUM = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FloatStrategy> {
        public String browsetimepage;
        public Integer duration;
        public Integer show_num;
        public Long show_time_begin;
        public Long show_time_end;
        public String toast;
        public Integer un_do_mission;

        public Builder() {
        }

        public Builder(FloatStrategy floatStrategy) {
            super(floatStrategy);
            if (floatStrategy == null) {
                return;
            }
            this.un_do_mission = floatStrategy.un_do_mission;
            this.browsetimepage = floatStrategy.browsetimepage;
            this.duration = floatStrategy.duration;
            this.show_time_begin = floatStrategy.show_time_begin;
            this.show_time_end = floatStrategy.show_time_end;
            this.show_num = floatStrategy.show_num;
            this.toast = floatStrategy.toast;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FloatStrategy build(boolean z) {
            return new FloatStrategy(this, z);
        }
    }

    public FloatStrategy(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.un_do_mission;
            if (num == null) {
                this.un_do_mission = DEFAULT_UN_DO_MISSION;
            } else {
                this.un_do_mission = num;
            }
            String str = builder.browsetimepage;
            if (str == null) {
                this.browsetimepage = "";
            } else {
                this.browsetimepage = str;
            }
            Integer num2 = builder.duration;
            if (num2 == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num2;
            }
            Long l = builder.show_time_begin;
            if (l == null) {
                this.show_time_begin = DEFAULT_SHOW_TIME_BEGIN;
            } else {
                this.show_time_begin = l;
            }
            Long l2 = builder.show_time_end;
            if (l2 == null) {
                this.show_time_end = DEFAULT_SHOW_TIME_END;
            } else {
                this.show_time_end = l2;
            }
            Integer num3 = builder.show_num;
            if (num3 == null) {
                this.show_num = DEFAULT_SHOW_NUM;
            } else {
                this.show_num = num3;
            }
            String str2 = builder.toast;
            if (str2 == null) {
                this.toast = "";
                return;
            } else {
                this.toast = str2;
                return;
            }
        }
        this.un_do_mission = builder.un_do_mission;
        this.browsetimepage = builder.browsetimepage;
        this.duration = builder.duration;
        this.show_time_begin = builder.show_time_begin;
        this.show_time_end = builder.show_time_end;
        this.show_num = builder.show_num;
        this.toast = builder.toast;
    }
}
