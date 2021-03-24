package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class NovelFansInfo extends Message {
    public static final Integer DEFAULT_LEVEL = 0;
    public static final String DEFAULT_LEVEL_ICON = "";
    public static final String DEFAULT_LEVEL_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String level_icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String level_name;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<NovelFansInfo> {
        public Integer level;
        public String level_icon;
        public String level_name;

        public Builder() {
        }

        public Builder(NovelFansInfo novelFansInfo) {
            super(novelFansInfo);
            if (novelFansInfo == null) {
                return;
            }
            this.level = novelFansInfo.level;
            this.level_name = novelFansInfo.level_name;
            this.level_icon = novelFansInfo.level_icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NovelFansInfo build(boolean z) {
            return new NovelFansInfo(this, z);
        }
    }

    public NovelFansInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.level;
            if (num == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num;
            }
            String str = builder.level_name;
            if (str == null) {
                this.level_name = "";
            } else {
                this.level_name = str;
            }
            String str2 = builder.level_icon;
            if (str2 == null) {
                this.level_icon = "";
                return;
            } else {
                this.level_icon = str2;
                return;
            }
        }
        this.level = builder.level;
        this.level_name = builder.level_name;
        this.level_icon = builder.level_icon;
    }
}
