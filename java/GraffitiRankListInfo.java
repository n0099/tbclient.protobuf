package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class GraffitiRankListInfo extends Message {
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
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer total;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_TOTAL = 0;
    public static final List<GraffitiRankItem> DEFAULT_LIST = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_LIST_COUNT = 0;
    public static final Integer DEFAULT_QUICK_LIST_COUNT = 0;
    public static final Integer DEFAULT_HAS_STATE = 0;

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
                return;
            } else {
                this.has_state = builder.has_state;
                return;
            }
        }
        this.has_more = builder.has_more;
        this.total = builder.total;
        this.list = immutableCopyOf(builder.list);
        this.show_list_count = builder.show_list_count;
        this.quick_list_count = builder.quick_list_count;
        this.has_state = builder.has_state;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<GraffitiRankListInfo> {
        public Integer has_more;
        public Integer has_state;
        public List<GraffitiRankItem> list;
        public Integer quick_list_count;
        public Integer show_list_count;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GraffitiRankListInfo build(boolean z) {
            return new GraffitiRankListInfo(this, z, null);
        }
    }
}
