package tbclient.GodFollowRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final List<GodUserInfo> DEFAULT_GODS_INFO = Collections.emptyList();
    public static final String DEFAULT_TAG = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GodUserInfo> gods_info;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tag;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tag == null) {
                this.tag = "";
            } else {
                this.tag = builder.tag;
            }
            if (builder.gods_info == null) {
                this.gods_info = DEFAULT_GODS_INFO;
                return;
            } else {
                this.gods_info = immutableCopyOf(builder.gods_info);
                return;
            }
        }
        this.tag = builder.tag;
        this.gods_info = immutableCopyOf(builder.gods_info);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<GodUserInfo> gods_info;
        public String tag;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.tag = dataRes.tag;
                this.gods_info = DataRes.copyOf(dataRes.gods_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
