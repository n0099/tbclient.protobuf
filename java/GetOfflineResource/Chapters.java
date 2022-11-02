package tbclient.GetOfflineResource;

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
public final class Chapters extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CHAPTER_ID;
    public static final Integer DEFAULT_CHAPTER_VIP;
    public static final Integer DEFAULT_RESOURCE_SIZE;
    public static final String DEFAULT_RESOURCE_URL = "";
    public static final Integer DEFAULT_TOTAL_IMG_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer chapter_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer chapter_vip;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer resource_size;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String resource_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer total_img_num;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Chapters> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer chapter_id;
        public Integer chapter_vip;
        public Integer resource_size;
        public String resource_url;
        public Integer total_img_num;

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
        public Builder(Chapters chapters) {
            super(chapters);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {chapters};
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
            if (chapters == null) {
                return;
            }
            this.chapter_id = chapters.chapter_id;
            this.resource_url = chapters.resource_url;
            this.resource_size = chapters.resource_size;
            this.total_img_num = chapters.total_img_num;
            this.chapter_vip = chapters.chapter_vip;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Chapters build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Chapters(this, z, null);
            }
            return (Chapters) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1796348725, "Ltbclient/GetOfflineResource/Chapters;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1796348725, "Ltbclient/GetOfflineResource/Chapters;");
                return;
            }
        }
        DEFAULT_CHAPTER_ID = 0;
        DEFAULT_RESOURCE_SIZE = 0;
        DEFAULT_TOTAL_IMG_NUM = 0;
        DEFAULT_CHAPTER_VIP = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Chapters(Builder builder, boolean z) {
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
            Integer num = builder.chapter_id;
            if (num == null) {
                this.chapter_id = DEFAULT_CHAPTER_ID;
            } else {
                this.chapter_id = num;
            }
            String str = builder.resource_url;
            if (str == null) {
                this.resource_url = "";
            } else {
                this.resource_url = str;
            }
            Integer num2 = builder.resource_size;
            if (num2 == null) {
                this.resource_size = DEFAULT_RESOURCE_SIZE;
            } else {
                this.resource_size = num2;
            }
            Integer num3 = builder.total_img_num;
            if (num3 == null) {
                this.total_img_num = DEFAULT_TOTAL_IMG_NUM;
            } else {
                this.total_img_num = num3;
            }
            Integer num4 = builder.chapter_vip;
            if (num4 == null) {
                this.chapter_vip = DEFAULT_CHAPTER_VIP;
                return;
            } else {
                this.chapter_vip = num4;
                return;
            }
        }
        this.chapter_id = builder.chapter_id;
        this.resource_url = builder.resource_url;
        this.resource_size = builder.resource_size;
        this.total_img_num = builder.total_img_num;
        this.chapter_vip = builder.chapter_vip;
    }

    public /* synthetic */ Chapters(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
