package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GraffitiRankListInfo extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<User> consent_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_state;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<GraffitiRankItem> list;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer quick_list_count;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer show_list_count;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer total;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_TOTAL = 0;
    public static final List<GraffitiRankItem> DEFAULT_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_LIST_COUNT = 0;
    public static final Integer DEFAULT_QUICK_LIST_COUNT = 0;
    public static final Integer DEFAULT_HAS_STATE = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final List<User> DEFAULT_CONSENT_LIST = Collections.emptyList();

    /* synthetic */ GraffitiRankListInfo(Builder builder, boolean z, GraffitiRankListInfo graffitiRankListInfo) {
        this(builder, z);
    }

    private GraffitiRankListInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.total == null) {
                this.total = DEFAULT_TOTAL;
            } else {
                this.total = builder.total;
            }
            if (builder.list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = immutableCopyOf(builder.list);
            }
            if (builder.show_list_count == null) {
                this.show_list_count = DEFAULT_SHOW_LIST_COUNT;
            } else {
                this.show_list_count = builder.show_list_count;
            }
            if (builder.quick_list_count == null) {
                this.quick_list_count = DEFAULT_QUICK_LIST_COUNT;
            } else {
                this.quick_list_count = builder.quick_list_count;
            }
            if (builder.has_state == null) {
                this.has_state = DEFAULT_HAS_STATE;
            } else {
                this.has_state = builder.has_state;
            }
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.consent_list == null) {
                this.consent_list = DEFAULT_CONSENT_LIST;
                return;
            } else {
                this.consent_list = immutableCopyOf(builder.consent_list);
                return;
            }
        }
        this.has_more = builder.has_more;
        this.total = builder.total;
        this.list = immutableCopyOf(builder.list);
        this.show_list_count = builder.show_list_count;
        this.quick_list_count = builder.quick_list_count;
        this.has_state = builder.has_state;
        this.tid = builder.tid;
        this.consent_list = immutableCopyOf(builder.consent_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GraffitiRankListInfo> {
        public List<User> consent_list;
        public Integer has_more;
        public Integer has_state;
        public List<GraffitiRankItem> list;
        public Integer quick_list_count;
        public Integer show_list_count;
        public Long tid;
        public Integer total;

        public Builder() {
        }

        public Builder(GraffitiRankListInfo graffitiRankListInfo) {
            super(graffitiRankListInfo);
            if (graffitiRankListInfo != null) {
                this.has_more = graffitiRankListInfo.has_more;
                this.total = graffitiRankListInfo.total;
                this.list = GraffitiRankListInfo.copyOf(graffitiRankListInfo.list);
                this.show_list_count = graffitiRankListInfo.show_list_count;
                this.quick_list_count = graffitiRankListInfo.quick_list_count;
                this.has_state = graffitiRankListInfo.has_state;
                this.tid = graffitiRankListInfo.tid;
                this.consent_list = GraffitiRankListInfo.copyOf(graffitiRankListInfo.consent_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiRankListInfo build(boolean z) {
            return new GraffitiRankListInfo(this, z, null);
        }
    }
}
