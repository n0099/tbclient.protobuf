package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class LiveRes extends Message {
    public static final String DEFAULT_IS_END = "";
    public static final List<YyLiveInfoSimple> DEFAULT_LIVE_LIST = Collections.emptyList();
    public static final List<LiveNormalConfig> DEFAULT_NORMAL_CONFIG_LIST = Collections.emptyList();
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String is_end;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<YyLiveInfoSimple> live_list;
    @ProtoField(tag = 1)
    public final NormalConfig normal_config;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<LiveNormalConfig> normal_config_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<LiveRes> {
        public String is_end;
        public List<YyLiveInfoSimple> live_list;
        public NormalConfig normal_config;
        public List<LiveNormalConfig> normal_config_list;

        public Builder() {
        }

        public Builder(LiveRes liveRes) {
            super(liveRes);
            if (liveRes == null) {
                return;
            }
            this.normal_config = liveRes.normal_config;
            this.live_list = Message.copyOf(liveRes.live_list);
            this.is_end = liveRes.is_end;
            this.normal_config_list = Message.copyOf(liveRes.normal_config_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveRes build(boolean z) {
            return new LiveRes(this, z);
        }
    }

    public LiveRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.normal_config = builder.normal_config;
            List<YyLiveInfoSimple> list = builder.live_list;
            if (list == null) {
                this.live_list = DEFAULT_LIVE_LIST;
            } else {
                this.live_list = Message.immutableCopyOf(list);
            }
            String str = builder.is_end;
            if (str == null) {
                this.is_end = "";
            } else {
                this.is_end = str;
            }
            List<LiveNormalConfig> list2 = builder.normal_config_list;
            if (list2 == null) {
                this.normal_config_list = DEFAULT_NORMAL_CONFIG_LIST;
                return;
            } else {
                this.normal_config_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.normal_config = builder.normal_config;
        this.live_list = Message.immutableCopyOf(builder.live_list);
        this.is_end = builder.is_end;
        this.normal_config_list = Message.immutableCopyOf(builder.normal_config_list);
    }
}
