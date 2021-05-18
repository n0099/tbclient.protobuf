package tbclient.GodFollowRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<GodUserInfo> DEFAULT_GODS_INFO = Collections.emptyList();
    public static final String DEFAULT_TAG = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GodUserInfo> gods_info;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tag;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<GodUserInfo> gods_info;
        public String tag;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.tag = dataRes.tag;
            this.gods_info = Message.copyOf(dataRes.gods_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.tag;
            if (str == null) {
                this.tag = "";
            } else {
                this.tag = str;
            }
            List<GodUserInfo> list = builder.gods_info;
            if (list == null) {
                this.gods_info = DEFAULT_GODS_INFO;
                return;
            } else {
                this.gods_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.tag = builder.tag;
        this.gods_info = Message.immutableCopyOf(builder.gods_info);
    }
}
