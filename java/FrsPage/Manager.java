package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class Manager extends Message {
    public static final Long DEFAULT_ID = 0L;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_SHOW_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String show_name;

    private Manager(Builder builder, boolean z) {
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
            if (builder.show_name == null) {
                this.show_name = "";
            } else {
                this.show_name = builder.show_name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = builder.portrait;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.show_name = builder.show_name;
        this.portrait = builder.portrait;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<Manager> {
        public Long id;
        public String name;
        public String portrait;
        public String show_name;

        public Builder() {
        }

        public Builder(Manager manager) {
            super(manager);
            if (manager != null) {
                this.id = manager.id;
                this.name = manager.name;
                this.show_name = manager.show_name;
                this.portrait = manager.portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Manager build(boolean z) {
            return new Manager(this, z);
        }
    }
}
