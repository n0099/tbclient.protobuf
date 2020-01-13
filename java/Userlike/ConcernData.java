package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes7.dex */
public final class ConcernData extends Message {
    @ProtoField(tag = 2)
    public final PostData post_data;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer recom_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<User> recom_user_list;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer source;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_list;
    public static final Integer DEFAULT_RECOM_TYPE = 0;
    public static final Integer DEFAULT_SOURCE = 0;
    public static final List<User> DEFAULT_RECOM_USER_LIST = Collections.emptyList();

    private ConcernData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_list = builder.thread_list;
            this.post_data = builder.post_data;
            if (builder.recom_type == null) {
                this.recom_type = DEFAULT_RECOM_TYPE;
            } else {
                this.recom_type = builder.recom_type;
            }
            if (builder.source == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = builder.source;
            }
            if (builder.recom_user_list == null) {
                this.recom_user_list = DEFAULT_RECOM_USER_LIST;
                return;
            } else {
                this.recom_user_list = immutableCopyOf(builder.recom_user_list);
                return;
            }
        }
        this.thread_list = builder.thread_list;
        this.post_data = builder.post_data;
        this.recom_type = builder.recom_type;
        this.source = builder.source;
        this.recom_user_list = immutableCopyOf(builder.recom_user_list);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ConcernData> {
        public PostData post_data;
        public Integer recom_type;
        public List<User> recom_user_list;
        public Integer source;
        public ThreadInfo thread_list;

        public Builder() {
        }

        public Builder(ConcernData concernData) {
            super(concernData);
            if (concernData != null) {
                this.thread_list = concernData.thread_list;
                this.post_data = concernData.post_data;
                this.recom_type = concernData.recom_type;
                this.source = concernData.source;
                this.recom_user_list = ConcernData.copyOf(concernData.recom_user_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConcernData build(boolean z) {
            return new ConcernData(this, z);
        }
    }
}
