package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;
/* loaded from: classes6.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String partial_visible_toast;
    @ProtoField(tag = 2)
    public final ThreadInfo thread_info;
    @ProtoField(tag = 1)
    public final User_Info user_info;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
            this.thread_info = builder.thread_info;
            if (builder.partial_visible_toast == null) {
                this.partial_visible_toast = "";
                return;
            } else {
                this.partial_visible_toast = builder.partial_visible_toast;
                return;
            }
        }
        this.user_info = builder.user_info;
        this.thread_info = builder.thread_info;
        this.partial_visible_toast = builder.partial_visible_toast;
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String partial_visible_toast;
        public ThreadInfo thread_info;
        public User_Info user_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user_info = dataRes.user_info;
                this.thread_info = dataRes.thread_info;
                this.partial_visible_toast = dataRes.partial_visible_toast;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
