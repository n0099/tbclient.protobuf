package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DailyInfo extends Message {
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_UPDATE_TIME = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String update_time;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DailyInfo> {
        public Integer has_more;
        public String tab_name;
        public List<ThreadInfo> thread_list;
        public String update_time;

        public Builder() {
        }

        public Builder(DailyInfo dailyInfo) {
            super(dailyInfo);
            if (dailyInfo == null) {
                return;
            }
            this.update_time = dailyInfo.update_time;
            this.tab_name = dailyInfo.tab_name;
            this.thread_list = Message.copyOf(dailyInfo.thread_list);
            this.has_more = dailyInfo.has_more;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DailyInfo build(boolean z) {
            return new DailyInfo(this, z);
        }
    }

    public DailyInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.update_time;
            if (str == null) {
                this.update_time = "";
            } else {
                this.update_time = str;
            }
            String str2 = builder.tab_name;
            if (str2 == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str2;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.update_time = builder.update_time;
        this.tab_name = builder.tab_name;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.has_more = builder.has_more;
    }
}
