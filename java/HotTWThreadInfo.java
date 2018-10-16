package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class HotTWThreadInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer fans_count;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> user_list;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FANS_COUNT = 0;

    private HotTWThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
            }
            if (builder.fans_count == null) {
                this.fans_count = DEFAULT_FANS_COUNT;
                return;
            } else {
                this.fans_count = builder.fans_count;
                return;
            }
        }
        this.user_list = immutableCopyOf(builder.user_list);
        this.fans_count = builder.fans_count;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<HotTWThreadInfo> {
        public Integer fans_count;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(HotTWThreadInfo hotTWThreadInfo) {
            super(hotTWThreadInfo);
            if (hotTWThreadInfo != null) {
                this.user_list = HotTWThreadInfo.copyOf(hotTWThreadInfo.user_list);
                this.fans_count = hotTWThreadInfo.fans_count;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotTWThreadInfo build(boolean z) {
            return new HotTWThreadInfo(this, z);
        }
    }
}
