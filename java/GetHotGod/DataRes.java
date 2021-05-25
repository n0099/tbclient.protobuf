package tbclient.GetHotGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer cur_page;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT64)
    public final List<Long> hot_uid_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
    public final List<Long> recommend_uid_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_list;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final List<Long> DEFAULT_HOT_UID_LIST = Collections.emptyList();
    public static final List<Long> DEFAULT_RECOMMEND_UID_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_CUR_PAGE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer cur_page;
        public Integer has_more;
        public List<Long> hot_uid_list;
        public List<Long> recommend_uid_list;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user_list = Message.copyOf(dataRes.user_list);
            this.hot_uid_list = Message.copyOf(dataRes.hot_uid_list);
            this.recommend_uid_list = Message.copyOf(dataRes.recommend_uid_list);
            this.has_more = dataRes.has_more;
            this.cur_page = dataRes.cur_page;
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
            List<User> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list);
            }
            List<Long> list2 = builder.hot_uid_list;
            if (list2 == null) {
                this.hot_uid_list = DEFAULT_HOT_UID_LIST;
            } else {
                this.hot_uid_list = Message.immutableCopyOf(list2);
            }
            List<Long> list3 = builder.recommend_uid_list;
            if (list3 == null) {
                this.recommend_uid_list = DEFAULT_RECOMMEND_UID_LIST;
            } else {
                this.recommend_uid_list = Message.immutableCopyOf(list3);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            Integer num2 = builder.cur_page;
            if (num2 == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
                return;
            } else {
                this.cur_page = num2;
                return;
            }
        }
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.hot_uid_list = Message.immutableCopyOf(builder.hot_uid_list);
        this.recommend_uid_list = Message.immutableCopyOf(builder.recommend_uid_list);
        this.has_more = builder.has_more;
        this.cur_page = builder.cur_page;
    }
}
