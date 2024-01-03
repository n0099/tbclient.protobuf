package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class RecomTagInfo extends Message {
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIC = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RecomTagInfo> {
        public String first_class;
        public Integer id;
        public String name;
        public String pic;

        public Builder() {
        }

        public Builder(RecomTagInfo recomTagInfo) {
            super(recomTagInfo);
            if (recomTagInfo == null) {
                return;
            }
            this.id = recomTagInfo.id;
            this.name = recomTagInfo.name;
            this.pic = recomTagInfo.pic;
            this.first_class = recomTagInfo.first_class;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomTagInfo build(boolean z) {
            return new RecomTagInfo(this, z);
        }
    }

    public RecomTagInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.pic;
            if (str2 == null) {
                this.pic = "";
            } else {
                this.pic = str2;
            }
            String str3 = builder.first_class;
            if (str3 == null) {
                this.first_class = "";
                return;
            } else {
                this.first_class = str3;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.pic = builder.pic;
        this.first_class = builder.first_class;
    }
}
