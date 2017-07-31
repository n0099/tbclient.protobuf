package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class SimpleForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_IS_EXISTS = 0;
    public static final Integer DEFAULT_IS_LIKED = 0;
    public static final Integer DEFAULT_IS_SIGNED = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SECOND_CLASS = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_exists;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer is_liked;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer is_signed;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String second_class;

    private SimpleForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.is_exists == null) {
                this.is_exists = DEFAULT_IS_EXISTS;
            } else {
                this.is_exists = builder.is_exists;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.is_liked == null) {
                this.is_liked = DEFAULT_IS_LIKED;
            } else {
                this.is_liked = builder.is_liked;
            }
            if (builder.is_signed == null) {
                this.is_signed = DEFAULT_IS_SIGNED;
            } else {
                this.is_signed = builder.is_signed;
            }
            if (builder.first_class == null) {
                this.first_class = "";
            } else {
                this.first_class = builder.first_class;
            }
            if (builder.second_class == null) {
                this.second_class = "";
            } else {
                this.second_class = builder.second_class;
            }
            if (builder.ext == null) {
                this.ext = "";
            } else {
                this.ext = builder.ext;
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
                return;
            } else {
                this.level_id = builder.level_id;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.is_exists = builder.is_exists;
        this.avatar = builder.avatar;
        this.is_liked = builder.is_liked;
        this.is_signed = builder.is_signed;
        this.first_class = builder.first_class;
        this.second_class = builder.second_class;
        this.ext = builder.ext;
        this.level_id = builder.level_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<SimpleForum> {
        public String avatar;
        public String ext;
        public String first_class;
        public Long id;
        public Integer is_exists;
        public Integer is_liked;
        public Integer is_signed;
        public Integer level_id;
        public String name;
        public String second_class;

        public Builder() {
        }

        public Builder(SimpleForum simpleForum) {
            super(simpleForum);
            if (simpleForum != null) {
                this.id = simpleForum.id;
                this.name = simpleForum.name;
                this.is_exists = simpleForum.is_exists;
                this.avatar = simpleForum.avatar;
                this.is_liked = simpleForum.is_liked;
                this.is_signed = simpleForum.is_signed;
                this.first_class = simpleForum.first_class;
                this.second_class = simpleForum.second_class;
                this.ext = simpleForum.ext;
                this.level_id = simpleForum.level_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SimpleForum build(boolean z) {
            return new SimpleForum(this, z);
        }
    }
}
