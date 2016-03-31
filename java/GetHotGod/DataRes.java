package tbclient.GetHotGod;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes.dex */
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

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.hot_uid_list == null) {
                this.hot_uid_list = DEFAULT_HOT_UID_LIST;
            } else {
                this.hot_uid_list = immutableCopyOf(builder.hot_uid_list);
            }
            if (builder.recommend_uid_list == null) {
                this.recommend_uid_list = DEFAULT_RECOMMEND_UID_LIST;
            } else {
                this.recommend_uid_list = immutableCopyOf(builder.recommend_uid_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.cur_page == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
                return;
            } else {
                this.cur_page = builder.cur_page;
                return;
            }
        }
        this.user_list = immutableCopyOf(builder.user_list);
        this.hot_uid_list = immutableCopyOf(builder.hot_uid_list);
        this.recommend_uid_list = immutableCopyOf(builder.recommend_uid_list);
        this.has_more = builder.has_more;
        this.cur_page = builder.cur_page;
    }

    /* loaded from: classes.dex */
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
            if (dataRes != null) {
                this.user_list = DataRes.copyOf(dataRes.user_list);
                this.hot_uid_list = DataRes.copyOf(dataRes.hot_uid_list);
                this.recommend_uid_list = DataRes.copyOf(dataRes.recommend_uid_list);
                this.has_more = dataRes.has_more;
                this.cur_page = dataRes.cur_page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
