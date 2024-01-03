package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RecomThreadList extends Message {
    public static final String DEFAULT_RECOMMEND_DATE = "";
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long current_pv;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String recommend_date;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_list;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Long DEFAULT_CURRENT_PV = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecomThreadList> {
        public Long current_pv;
        public String recommend_date;
        public List<ThreadInfo> thread_list;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(RecomThreadList recomThreadList) {
            super(recomThreadList);
            if (recomThreadList == null) {
                return;
            }
            this.user_list = Message.copyOf(recomThreadList.user_list);
            this.thread_list = Message.copyOf(recomThreadList.thread_list);
            this.recommend_date = recomThreadList.recommend_date;
            this.current_pv = recomThreadList.current_pv;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomThreadList build(boolean z) {
            return new RecomThreadList(this, z);
        }
    }

    public RecomThreadList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<User> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.thread_list;
            if (list2 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list2);
            }
            String str = builder.recommend_date;
            if (str == null) {
                this.recommend_date = "";
            } else {
                this.recommend_date = str;
            }
            Long l = builder.current_pv;
            if (l == null) {
                this.current_pv = DEFAULT_CURRENT_PV;
                return;
            } else {
                this.current_pv = l;
                return;
            }
        }
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.recommend_date = builder.recommend_date;
        this.current_pv = builder.current_pv;
    }
}
