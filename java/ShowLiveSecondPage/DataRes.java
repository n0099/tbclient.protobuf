package tbclient.ShowLiveSecondPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer is_refresh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> live;
    public static final List<ThreadInfo> DEFAULT_LIVE = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_IS_REFRESH = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.live == null) {
                this.live = DEFAULT_LIVE;
            } else {
                this.live = immutableCopyOf(builder.live);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.is_refresh == null) {
                this.is_refresh = DEFAULT_IS_REFRESH;
                return;
            } else {
                this.is_refresh = builder.is_refresh;
                return;
            }
        }
        this.live = immutableCopyOf(builder.live);
        this.has_more = builder.has_more;
        this.is_refresh = builder.is_refresh;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
        public Integer is_refresh;
        public List<ThreadInfo> live;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.live = DataRes.copyOf(dataRes.live);
                this.has_more = dataRes.has_more;
                this.is_refresh = dataRes.is_refresh;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
