package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SportPageHeadInfo;
import tbclient.SportScheduleInfo;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> general_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer new_thread_num;
    @ProtoField(tag = 5)
    public final SportPageHeadInfo sport_head_info;
    @ProtoField(tag = 4)
    public final SportScheduleInfo sport_schedule_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_list;
    public static final List<ThreadInfo> DEFAULT_GENERAL_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_NEW_THREAD_NUM = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.general_list == null) {
                this.general_list = DEFAULT_GENERAL_LIST;
            } else {
                this.general_list = immutableCopyOf(builder.general_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            this.sport_schedule_info = builder.sport_schedule_info;
            this.sport_head_info = builder.sport_head_info;
            if (builder.new_thread_num == null) {
                this.new_thread_num = DEFAULT_NEW_THREAD_NUM;
                return;
            } else {
                this.new_thread_num = builder.new_thread_num;
                return;
            }
        }
        this.general_list = immutableCopyOf(builder.general_list);
        this.has_more = builder.has_more;
        this.user_list = immutableCopyOf(builder.user_list);
        this.sport_schedule_info = builder.sport_schedule_info;
        this.sport_head_info = builder.sport_head_info;
        this.new_thread_num = builder.new_thread_num;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> general_list;
        public Integer has_more;
        public Integer new_thread_num;
        public SportPageHeadInfo sport_head_info;
        public SportScheduleInfo sport_schedule_info;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.general_list = DataRes.copyOf(dataRes.general_list);
                this.has_more = dataRes.has_more;
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.sport_schedule_info = dataRes.sport_schedule_info;
                this.sport_head_info = dataRes.sport_head_info;
                this.new_thread_num = dataRes.new_thread_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
