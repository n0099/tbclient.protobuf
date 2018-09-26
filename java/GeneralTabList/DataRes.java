package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<ThreadInfo> DEFAULT_GENERAL_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> general_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_list;

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
                return;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
                return;
            }
        }
        this.general_list = immutableCopyOf(builder.general_list);
        this.has_more = builder.has_more;
        this.user_list = immutableCopyOf(builder.user_list);
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThreadInfo> general_list;
        public Integer has_more;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.general_list = DataRes.copyOf(dataRes.general_list);
                this.has_more = dataRes.has_more;
                this.user_list = DataRes.copyOf(dataRes.user_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
