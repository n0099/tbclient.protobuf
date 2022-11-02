package tbclient.GetBookStore;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Shelf extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CARTOON_ID;
    public static final String DEFAULT_CARTOON_NAME = "";
    public static final String DEFAULT_COVER_IMG = "";
    public static final Integer DEFAULT_FIRST_CHAPTER_ID;
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_TOTAL_CHAPTER;
    public static final Long DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long cartoon_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String cartoon_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String cover_img;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer first_chapter_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer total_chapter;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long update_time;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Shelf> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long cartoon_id;
        public String cartoon_name;
        public String cover_img;
        public Integer first_chapter_id;
        public Long forum_id;
        public Integer total_chapter;
        public Long update_time;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Shelf shelf) {
            super(shelf);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {shelf};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (shelf == null) {
                return;
            }
            this.forum_id = shelf.forum_id;
            this.cartoon_id = shelf.cartoon_id;
            this.cartoon_name = shelf.cartoon_name;
            this.total_chapter = shelf.total_chapter;
            this.first_chapter_id = shelf.first_chapter_id;
            this.cover_img = shelf.cover_img;
            this.update_time = shelf.update_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Shelf build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Shelf(this, z, null);
            }
            return (Shelf) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1959106508, "Ltbclient/GetBookStore/Shelf;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1959106508, "Ltbclient/GetBookStore/Shelf;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_CARTOON_ID = 0L;
        DEFAULT_TOTAL_CHAPTER = 0;
        DEFAULT_FIRST_CHAPTER_ID = 0;
        DEFAULT_UPDATE_TIME = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shelf(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.cartoon_id;
            if (l2 == null) {
                this.cartoon_id = DEFAULT_CARTOON_ID;
            } else {
                this.cartoon_id = l2;
            }
            String str = builder.cartoon_name;
            if (str == null) {
                this.cartoon_name = "";
            } else {
                this.cartoon_name = str;
            }
            Integer num = builder.total_chapter;
            if (num == null) {
                this.total_chapter = DEFAULT_TOTAL_CHAPTER;
            } else {
                this.total_chapter = num;
            }
            Integer num2 = builder.first_chapter_id;
            if (num2 == null) {
                this.first_chapter_id = DEFAULT_FIRST_CHAPTER_ID;
            } else {
                this.first_chapter_id = num2;
            }
            String str2 = builder.cover_img;
            if (str2 == null) {
                this.cover_img = "";
            } else {
                this.cover_img = str2;
            }
            Long l3 = builder.update_time;
            if (l3 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
                return;
            } else {
                this.update_time = l3;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.cartoon_id = builder.cartoon_id;
        this.cartoon_name = builder.cartoon_name;
        this.total_chapter = builder.total_chapter;
        this.first_chapter_id = builder.first_chapter_id;
        this.cover_img = builder.cover_img;
        this.update_time = builder.update_time;
    }

    public /* synthetic */ Shelf(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
