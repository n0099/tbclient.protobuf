package tbclient.UnreadTip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_SHOW_TIP = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long hide_unix;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> portrait_list;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_tip;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer user_count;
    public static final Integer DEFAULT_USER_COUNT = 0;
    public static final List<String> DEFAULT_PORTRAIT_LIST = Collections.emptyList();
    public static final Long DEFAULT_HIDE_UNIX = 0L;
    public static final Integer DEFAULT_THREAD_COUNT = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_count == null) {
                this.user_count = DEFAULT_USER_COUNT;
            } else {
                this.user_count = builder.user_count;
            }
            if (builder.portrait_list == null) {
                this.portrait_list = DEFAULT_PORTRAIT_LIST;
            } else {
                this.portrait_list = immutableCopyOf(builder.portrait_list);
            }
            if (builder.hide_unix == null) {
                this.hide_unix = DEFAULT_HIDE_UNIX;
            } else {
                this.hide_unix = builder.hide_unix;
            }
            if (builder.show_tip == null) {
                this.show_tip = "";
            } else {
                this.show_tip = builder.show_tip;
            }
            if (builder.thread_count == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
                return;
            } else {
                this.thread_count = builder.thread_count;
                return;
            }
        }
        this.user_count = builder.user_count;
        this.portrait_list = immutableCopyOf(builder.portrait_list);
        this.hide_unix = builder.hide_unix;
        this.show_tip = builder.show_tip;
        this.thread_count = builder.thread_count;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long hide_unix;
        public List<String> portrait_list;
        public String show_tip;
        public Integer thread_count;
        public Integer user_count;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.user_count = dataRes.user_count;
                this.portrait_list = DataRes.copyOf(dataRes.portrait_list);
                this.hide_unix = dataRes.hide_unix;
                this.show_tip = dataRes.show_tip;
                this.thread_count = dataRes.thread_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
