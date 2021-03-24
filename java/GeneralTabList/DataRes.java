package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.App;
import tbclient.ItemInfo;
import tbclient.SportPageHeadInfo;
import tbclient.SportScheduleInfo;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<App> app_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> general_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 8)
    public final ItemInfo item_info;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer new_thread_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sort_type;
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
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final List<App> DEFAULT_APP_LIST = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<App> app_list;
        public List<ThreadInfo> general_list;
        public Integer has_more;
        public ItemInfo item_info;
        public Integer new_thread_num;
        public Integer sort_type;
        public SportPageHeadInfo sport_head_info;
        public SportScheduleInfo sport_schedule_info;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.general_list = Message.copyOf(dataRes.general_list);
            this.has_more = dataRes.has_more;
            this.user_list = Message.copyOf(dataRes.user_list);
            this.sport_schedule_info = dataRes.sport_schedule_info;
            this.sport_head_info = dataRes.sport_head_info;
            this.new_thread_num = dataRes.new_thread_num;
            this.sort_type = dataRes.sort_type;
            this.item_info = dataRes.item_info;
            this.app_list = Message.copyOf(dataRes.app_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.general_list;
            if (list == null) {
                this.general_list = DEFAULT_GENERAL_LIST;
            } else {
                this.general_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            List<User> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
            }
            this.sport_schedule_info = builder.sport_schedule_info;
            this.sport_head_info = builder.sport_head_info;
            Integer num2 = builder.new_thread_num;
            if (num2 == null) {
                this.new_thread_num = DEFAULT_NEW_THREAD_NUM;
            } else {
                this.new_thread_num = num2;
            }
            Integer num3 = builder.sort_type;
            if (num3 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num3;
            }
            this.item_info = builder.item_info;
            List<App> list3 = builder.app_list;
            if (list3 == null) {
                this.app_list = DEFAULT_APP_LIST;
                return;
            } else {
                this.app_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.general_list = Message.immutableCopyOf(builder.general_list);
        this.has_more = builder.has_more;
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.sport_schedule_info = builder.sport_schedule_info;
        this.sport_head_info = builder.sport_head_info;
        this.new_thread_num = builder.new_thread_num;
        this.sort_type = builder.sort_type;
        this.item_info = builder.item_info;
        this.app_list = Message.immutableCopyOf(builder.app_list);
    }
}
