package tbclient.GetLevelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LevelInfo;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_LEVEL_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<LevelInfo> level_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_level;
    public static final List<LevelInfo> DEFAULT_LEVEL_INFO = Collections.emptyList();
    public static final Integer DEFAULT_IS_LIKE = 0;
    public static final Integer DEFAULT_USER_LEVEL = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.level_info == null) {
                this.level_info = DEFAULT_LEVEL_INFO;
            } else {
                this.level_info = immutableCopyOf(builder.level_info);
            }
            if (builder.is_like == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = builder.is_like;
            }
            if (builder.user_level == null) {
                this.user_level = DEFAULT_USER_LEVEL;
            } else {
                this.user_level = builder.user_level;
            }
            if (builder.level_name == null) {
                this.level_name = "";
                return;
            } else {
                this.level_name = builder.level_name;
                return;
            }
        }
        this.level_info = immutableCopyOf(builder.level_info);
        this.is_like = builder.is_like;
        this.user_level = builder.user_level;
        this.level_name = builder.level_name;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer is_like;
        public List<LevelInfo> level_info;
        public String level_name;
        public Integer user_level;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.level_info = DataRes.copyOf(dataRes.level_info);
                this.is_like = dataRes.is_like;
                this.user_level = dataRes.user_level;
                this.level_name = dataRes.level_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
