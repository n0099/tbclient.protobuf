package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class PollInfo extends Message {
    public static final String DEFAULT_POLLED_VALUE = "";
    public static final String DEFAULT_TIPS = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_multi;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_polled;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer last_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<PollOption> options;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer options_count;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String polled_value;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tips;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long total_num;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long total_poll;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_IS_MULTI = 0;
    public static final Long DEFAULT_TOTAL_NUM = 0L;
    public static final Integer DEFAULT_OPTIONS_COUNT = 0;
    public static final Integer DEFAULT_IS_POLLED = 0;
    public static final Integer DEFAULT_END_TIME = 0;
    public static final List<PollOption> DEFAULT_OPTIONS = Collections.emptyList();
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_TOTAL_POLL = 0L;
    public static final Integer DEFAULT_LAST_TIME = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PollInfo> {
        public Integer end_time;
        public Integer is_multi;
        public Integer is_polled;
        public Integer last_time;
        public List<PollOption> options;
        public Integer options_count;
        public String polled_value;
        public Integer status;
        public String tips;
        public String title;
        public Long total_num;
        public Long total_poll;
        public Integer type;

        public Builder() {
        }

        public Builder(PollInfo pollInfo) {
            super(pollInfo);
            if (pollInfo == null) {
                return;
            }
            this.type = pollInfo.type;
            this.is_multi = pollInfo.is_multi;
            this.total_num = pollInfo.total_num;
            this.options_count = pollInfo.options_count;
            this.is_polled = pollInfo.is_polled;
            this.polled_value = pollInfo.polled_value;
            this.tips = pollInfo.tips;
            this.end_time = pollInfo.end_time;
            this.options = Message.copyOf(pollInfo.options);
            this.status = pollInfo.status;
            this.total_poll = pollInfo.total_poll;
            this.title = pollInfo.title;
            this.last_time = pollInfo.last_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PollInfo build(boolean z) {
            return new PollInfo(this, z);
        }
    }

    public PollInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.is_multi;
            if (num2 == null) {
                this.is_multi = DEFAULT_IS_MULTI;
            } else {
                this.is_multi = num2;
            }
            Long l = builder.total_num;
            if (l == null) {
                this.total_num = DEFAULT_TOTAL_NUM;
            } else {
                this.total_num = l;
            }
            Integer num3 = builder.options_count;
            if (num3 == null) {
                this.options_count = DEFAULT_OPTIONS_COUNT;
            } else {
                this.options_count = num3;
            }
            Integer num4 = builder.is_polled;
            if (num4 == null) {
                this.is_polled = DEFAULT_IS_POLLED;
            } else {
                this.is_polled = num4;
            }
            String str = builder.polled_value;
            if (str == null) {
                this.polled_value = "";
            } else {
                this.polled_value = str;
            }
            String str2 = builder.tips;
            if (str2 == null) {
                this.tips = "";
            } else {
                this.tips = str2;
            }
            Integer num5 = builder.end_time;
            if (num5 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num5;
            }
            List<PollOption> list = builder.options;
            if (list == null) {
                this.options = DEFAULT_OPTIONS;
            } else {
                this.options = Message.immutableCopyOf(list);
            }
            Integer num6 = builder.status;
            if (num6 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num6;
            }
            Long l2 = builder.total_poll;
            if (l2 == null) {
                this.total_poll = DEFAULT_TOTAL_POLL;
            } else {
                this.total_poll = l2;
            }
            String str3 = builder.title;
            if (str3 == null) {
                this.title = "";
            } else {
                this.title = str3;
            }
            Integer num7 = builder.last_time;
            if (num7 == null) {
                this.last_time = DEFAULT_LAST_TIME;
                return;
            } else {
                this.last_time = num7;
                return;
            }
        }
        this.type = builder.type;
        this.is_multi = builder.is_multi;
        this.total_num = builder.total_num;
        this.options_count = builder.options_count;
        this.is_polled = builder.is_polled;
        this.polled_value = builder.polled_value;
        this.tips = builder.tips;
        this.end_time = builder.end_time;
        this.options = Message.immutableCopyOf(builder.options);
        this.status = builder.status;
        this.total_poll = builder.total_poll;
        this.title = builder.title;
        this.last_time = builder.last_time;
    }
}
