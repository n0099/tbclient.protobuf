package tbclient.GetRecommendGodList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes22.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer current_page;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> recom_user_list;
    public static final List<User> DEFAULT_RECOM_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CURRENT_PAGE = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.recom_user_list == null) {
                this.recom_user_list = DEFAULT_RECOM_USER_LIST;
            } else {
                this.recom_user_list = immutableCopyOf(builder.recom_user_list);
            }
            if (builder.current_page == null) {
                this.current_page = DEFAULT_CURRENT_PAGE;
            } else {
                this.current_page = builder.current_page;
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.recom_user_list = immutableCopyOf(builder.recom_user_list);
        this.current_page = builder.current_page;
        this.has_more = builder.has_more;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer current_page;
        public Integer has_more;
        public List<User> recom_user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.recom_user_list = DataRes.copyOf(dataRes.recom_user_list);
                this.current_page = dataRes.current_page;
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}